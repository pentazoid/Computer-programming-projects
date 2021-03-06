import matplotlib.pyplot as plt

import matplotlib.dates as mdates
import matplotlib.ticker as mticker
from matplotlib.finance import candlestick_ohlc

import urllib
import numpy as np
import datetime as dt

from matplotlib import style

style.use('fivethirtyeight')

MA1=10
MA2=30


#to list all the styles available in the library
#print(plt.style.available)



#print(plt.__file__)



def bytespdate2num(fmt,encoding='utf-8'):
    str_converter=mdates.strpdate2num(fmt)

    def bytes_converter(b):
        s=b.decode(encoding)
        return str_converter(s)
    return bytes_converter

def moving_average(values,window):
    weights=np.repeat(1.0,window)/window
    smas=np.convolve(values,weights,'valid')
    return smas

def high_minus_low(highs,lows):
    return highs-lows
##highs=[6,7,8,7,6,8,9]
##lows=[1,2,3,2,4,2,1]
##
##h_1=list(map(high_minus_low,highs,lows))
##
##print(h_1)

def graph_data(stock):

   fig=plt.figure()
   ax1=plt.subplot2grid((6,1),(0,0),rowspan=1,colspan=1)
   ax2=plt.subplot2grid((6,1),(1,0),rowspan=4,colspan=1)
   
   
   plt.ylabel('Price')

   ax3=plt.subplot2grid((6,1),(5,0),rowspan=1,colspan=1)

   print('Currently pulling',stock)
   url='http://chartapi.finance.yahoo.com/instrument/1.0/'+stock+'/chartdata;type=quote;range=3m/csv'
   print(url)
   source_code=urllib.request.urlopen(url).read().decode()
   stock_data=[]
   split_source=source_code.split('\n')

   for each_line in split_source:
       split_line=each_line.split(',')
       if len(split_line)==6:
           if 'values' not in each_line:
               stock_data.append(each_line)

   date, closep, highp,lowp,openp,volume=np.loadtxt(stock_data,delimiter=',',unpack=True,converters={0:  bytespdate2num('%Y%m%d')})

   ma1=moving_average(closep,MA1)
   ma2=moving_average(closep,MA2)
   
   start=len(date[MA2-1:])
   print(start)

   

   x=0
   y=len(date)
   new_list=[]
   while x<y:
       append_line=date[x], openp[x], highp[x], lowp[x], closep[x], volume[x]
       new_list.append(append_line)
       x+=1
   h_1=list(map(high_minus_low,highp,lowp))
   ax1.plot_date(date,h_1,'-')
   plt.setp(ax1.get_xticklabels(),visible=False)
   
   
   
       



   candlestick_ohlc(ax2,new_list,width=.6,colorup='r',colordown='g')
   ax2.grid(True)    
   for label in ax2.xaxis.get_ticklabels():
       label.set_rotation(45)

   ax2.xaxis.set_major_locator(mticker.MaxNLocator(10))
   ax2.xaxis.set_major_formatter(mdates.DateFormatter('%Y-%m-%d'))
##   ax1.annotate('Oil Spill!!',(date[24],closep[24]),xytext=(0.8,0.9),textcoords='axes fraction',arrowprops=dict(facecolor="#585858",color="#585858"))
##

   #want to actually annotate
   #last price
   bbox_props=dict(boxstyle='larrow,pad=0.3',fc="#f2f1f1",ec='k',lw=2)
   bbox=bbox_props
   ax2.annotate(str(closep[-1]), (date[-1],closep[-1]),xytext=(date[-1]+5,closep[-1]),bbox=bbox_props)

   plt.setp(ax2.get_xticklabels(),visible=False)
   print(len(date))
   print(len(ma1))
   ax3.plot(date[-start:],ma1[-start:],linewidth=1)
   ax3.plot(date[-start:],ma2[-start:],linewidth=1)
   ax3.fill_between(date[-start:],ma2[-start:],ma1[-start:],where=(ma2[-start]>=ma1[-start:]),facecolor='r',edgecolor='r',alpha=0.5)
   ax3.fill_between(date[-start:],ma2[-start:],ma1[-start:],where=(ma2[-start]<=ma1[-start:]),facecolor='g',edgecolor='g',alpha=0.5)


   plt.ylabel('Price')
   plt.xlabel('Date')
       

   
   #ax1.grid(True,color='g',linestyle='-',linewidth=3)
   ax2.grid(True)
   plt.subplots_adjust(left=.09, bottom=.16,right=.94,top=.95,wspace=.2,hspace=0)
   plt.show()

stock=input('Stock to plot: ')
graph_data(stock)
   
