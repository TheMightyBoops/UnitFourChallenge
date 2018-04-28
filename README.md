# UnitFourChallenge
Last project for advanced java. 

I used a lot of packages in this project, and this is simply because I don't want to 
keep writing the same Java over and over. I sort of intend to keep a little bit more detailed log in 
this assignment. 

1) April 27th, 2018 - I decided that making each calculator it's own strategy was a bad idea, so 
I built 2 out to be singleton, and will apply the factory pattern in the menus of my application. 
Also I came up with a great name for my reader/writer packages. 

2) April 28th, 2018 - If you went back to the commits made this day 
you would notice the main method isn't really
implementing some of the methods correctly, but most are working as intended. 
One of the singleton classes needs to be fixed, but hey. I ended up using factory 
in order to instance my menus, so eventually it should make main a little less cluttered. 
I built the class that calculates the timed tickets as a strategy type package, and it works great. 
Time machine is a hacky package that allows time to be done via integers and spits out strings based on 
a normal time format e.g. not 24 hours, I want to clean everything up and do some more 
unittests/javadoc before I try reading/writing to a file.   
