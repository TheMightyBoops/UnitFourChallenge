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

3) April 29th, 2018 - I just realized something after implementing my libraries into an actual system (which didn't 
take too long). I'm going to have to write the javaDoc for like 25 classes, that is going to take forever!
Anyway, Main may look a little messy, and my report creator class is a little messy, but it's all working, 
and so far as scanner input mismatches there's no exceptions that i've come across. I finally successfully 
implemented recursion into a project, I didn't really see an easier way to iterate back over some of 
my main method calls. There's a lot of pieces to my system, but I think for the most part it makes sense, 
and I may actually use the bones of my MenuCreator package in other things if I end up still writing 
a lot of console applications in distributed java. Anyway that's really all there is going on in the 
changes for today. Cheers!  

4) May 9th, 2018 - I started my JavaDoc, it's okay, I've found some refactoring 
that I should refactor and turn into constants, I don't know if I'm 
going to do that just in interest of time. Sort of a boring inclusion,
sorry. 
