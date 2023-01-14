import numpy as np
import matplotlib.pyplot as plt

x = np.array([80, 85, 90, 95, 100, 105, 110, 115, 120, 125])
y = np.array([240, 250, 260, 270, 280, 290, 300, 310, 320, 330])

plt.plot(x, y)
FONT1={'family':'serif','color':'green','size':'20'}
FONT2={'family':'serif','color':'yellow','size':'40'}

plt.xlabel("Average Pulse",fontdict=FONT1)
plt.ylabel("Calorie Burnage",fontdict=FONT2)
plt.title("shanwaz")
plt.show()