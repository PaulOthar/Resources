# Inverse Depth Buffer

Inverse Depth buffer is a solution, to a problem i currently have with performance.

Currently i have a depth buffer that resets itstelf to 0, for every cycle, and this loop around a big depth map is reeeeeeeeally taxing on my engine.

My solution is: instead of reseting the depth map, i could just swap the criteria for drawing in the depth map, to a negative value aproach, for every cycle:

IMAGE

It currently works exclusivly for scenarios that fills entire screens.