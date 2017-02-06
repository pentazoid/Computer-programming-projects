from mpl_toolkits.mplot3d import axes3d
import matplotlib.pyplot as plt
import numpy as np

fig=plt.figure()
ax1=fig.add_subplot(111,projection='3d')

x=[1,2,3,4,5,6,7,8,9]
y=[2,3,4,6,3,8,5,3,6]
#z=[0,0,0,0,0,0,0,0,0]
#or
z=np.zeros(9)
dx=np.ones(9)
dy=np.ones(9)
dz=[1,2,3,4,5,6,7,8,9]



ax1.bar3d(x,y,z,dx,dy,dz)
ax1.set_xlabel('x axis')
ax1.set_ylabel('y axis')
ax1.set_zlabel('z axis')


plt.legend()

plt.show()
