from mpl_toolkits.mplot3d import axes3d
import matplotlib.pyplot as plt

fig=plt.figure()
ax1=fig.add_subplot(111,projection='3d')

x=[1,2,3,4,5,6,7,8,9]
y=[2,3,4,6,3,8,5,3,6]

z=[7,4,2,6,4,6,4,3,9]

ax1.plot_wireframe(x,y,z)


ax1.set_xlabel('x axis')
ax1.set_ylabel('y axis')
ax1.set_zlabel('z axis')



plt.show()
