import matplotlib.pyplot as plt
import numpy as np

x = np.array([0, 1, 2, 3])
y = np.array([3, 8, 1, 10])

plt.subplot(1,4, 1)
plt.plot(x,y)
plt.title("Income")
plt.grid(color="pink",linestyle="--",linewidth=0.5 )

x = np.array([0, 1, 2, 3])
y = np.array([10, 20, 30, 40])

plt.subplot(1,4, 2)
plt.plot(x,y)
plt.title("TAX")
plt.grid(color="green",linestyle="--",linewidth=0.5 )

x = np.array([0, 1, 2, 3])
y = np.array([10, 20, 30, 40])

plt.subplot(1,4, 3)
plt.plot(x,y)
plt.title("Puchuku")
plt.grid(color="orange",linestyle="--",linewidth=0.5 )

x = np.array([0, 1, 2, 3])
y = np.array([10, 20, 30, 40])

plt.subplot(1,4, 4)
plt.plot(x,y)
plt.title("Pradeep")
plt.grid(color="red",linestyle="--",linewidth=0.5 )


plt.plot(x,y)
plt.show()