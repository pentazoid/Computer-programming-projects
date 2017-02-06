import matplotlib.pyplot as plt

test_scores=[55,45,88,75,43,56,89,98,55,54,65,77,88,81,82,89,92,98,65,76,76,73,72,84]
time_spent=[10,11,22,23,28,32,54,55,43,23,53,33,22,55,23,33,38,48,22,35,37,42,29,12]
##x=[x for x in range(len(test_scores))]
##
##plt.bar(x,test_scores)
##plt.show()

plt.title("Test scores vs time spent")
plt.xlabel('time spent on test')
plt.ylabel('Test Score')
plt.scatter(time_spent,test_scores)

plt.show()
x=[1,2,3,4,5]
y1=[2,3,2,4,2]
y2=[8,8,6,7,6]

plt.scatter(x,y1,marker='o',color='r')
plt.scatter(x,y2,marker='v',color='m')

plt.show()
