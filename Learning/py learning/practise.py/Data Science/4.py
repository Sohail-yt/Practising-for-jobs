import numpy as np
import matplotlib.pyplot as plt

x = np.array([80, 85, 90, 95, 100, 105, 110, 115, 120, 125])
y = np.array([240, 250, 260, 270, 280, 290, 300, 310, 320, 330])

plt.plot(x, y,"orange")
# plt.grid(color="green",linestyle="--",linewidth=1.5 )
# plt.grid(color="pink",linestyle="dashdot",linewidth=1.5 )
plt.grid(color="pink",linestyle="dotted",linewidth=2.5 )
# plt.grid(color="pink",linestyle="solid",linewidth=1.5 )
plt.title("Puchuku Pradeep",fontname="Brush Script MT", fontsize=28,loc="center")
plt.xlabel("Average Pulse")
plt.ylabel("Calorie Burnage")

plt.show()