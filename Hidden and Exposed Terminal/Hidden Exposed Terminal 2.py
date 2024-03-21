#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import turtle
import time

class MobileDevice:
    def __init__(self, name, position):
        self.name = name
        self.position = position

    def transmit(self, destination):
        print(f"{self.name} transmitting to {destination.name}...")
        time.sleep(1)
        print(f"Transmission successful: {self.name} -> {destination.name}")

def draw_device(device):
    turtle.penup()
    turtle.goto(device.position)
    turtle.pendown()
    turtle.dot(30, device.color)

def draw_line(start, end):
    turtle.penup()
    turtle.goto(start)
    turtle.pendown()
    turtle.goto(end)

def simulate_scenario(with_rts_cts=False):
    # Setup turtle window
    turtle.title("Wireless Network Scenario")
    turtle.setup(400, 200)
    turtle.speed(0)
    turtle.hideturtle()

    # Create mobile devices
    node_0 = MobileDevice("Node #0", (50, 0))
    node_1 = MobileDevice("Node #1", (250, 0))
    ap = MobileDevice("AP", (150, 0))

    # Assign colors
    node_0.color = "blue"
    node_1.color = "red"
    ap.color = "green"

    # Draw mobile devices
    draw_device(node_0)
    draw_device(node_1)
    draw_device(ap)

    # Transmission sequence without RTS/CTS
    if not with_rts_cts:
        draw_line(node_0.position, ap.position)
        draw_line(node_1.position, ap.position)
        node_0.transmit(ap)
        node_1.transmit(ap)

    # Transmission sequence with RTS/CTS
    else:
        draw_line(node_0.position, ap.position)
        draw_line(node_1.position, ap.position)
        # Node #0 sends RTS to AP
        print("Node #0 sends RTS to AP")
        time.sleep(1)
        print("AP sends CTS to Node #0")
        time.sleep(1)
        node_0.transmit(ap)
        
        # Node #1 waits for CTS from AP
        print("Node #1 waits for CTS from AP")
        time.sleep(1)
        print("AP sends CTS to Node #1")
        time.sleep(1)
        node_1.transmit(ap)

    turtle.done()

# Simulate scenarios
print("Scenario without RTS/CTS:")
simulate_scenario()

print("\nScenario with RTS/CTS:")
simulate_scenario(with_rts_cts=True)


# In[ ]:




