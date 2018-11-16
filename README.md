# New-Vehicles
abstract factory design

## Executive Summary
The goal of this project is to implement an abstract factory design pattern into a program management system that is currently using a factory design pattern. GetITGood wants to expand their car manufacturing business for vendors. Currently they produce only cars for Ford but want to gain other vendors and produce other vehicles such as trucks and SUVs. The abstract factory design pattern is explained in detail along with a class diagram. Then the design pattern is implemented and sample demonstration is displayed to show its effectiveness. The abstract factory design pattern is then modified to include trucks and SUVs. A detailed class diagram is used to show the flow of the system and screenshots are provided to show how the code runs in java. 

## Introduction
GetITGood is a third-party vehicle manufacturing company. I was hired to improve and expand their production management system. Initially GetITGood only produced two car models: Focus and Mustang. It also only worked with Ford as a vendor. Because of the simplicity of their goals, a factory design pattern was initially used with **FordCar** being the interface and **FordCarFactory** is the concrete class using the interface.

Because of the success of GetITGood, they are now prime to manufacture more types of cars. They want to produce four Car models: Focus, Mustang, Corolla, and Prius. In addition to Ford, they now have Toyota as a vendor. Since the car models belong to different companies, they also will be produced in different factories. Focus and Mustang are manufactured in a **FordCarFactory** and Corolla and Prius are manufactured in **ToyotaCarFactory**. For each car company, I could set up separate Factory design patterns for each company which is easy to implement. However, doing this may increase runtime, memory used, and overall could be time consuming if other types of vehicles are added in the future. I needed to find a more efficient way for the system to run.

Afterwards, GetITGood decided that they wanted to manufacture trucks in addition to cars. They decided to begin with only two truck models: F150 and Tacoma. These belong to Ford and Toyota respectively. The trucks will not be manufactured in the same way as the cars so they require separate factories. GetITGood also wanted me to design a plan of adding SUVs to the system with Kia and Hyundai as the two vendors.

## Screencast
Please review my screencast of this project by downloading the file: **__MIS507A Project Screencast.mp4__** above. This short video provides a view of the final abstract factory design, the coding involved, and execution of the program. 

The abstract factory design pattern delivers an interface for creating families of related or dependent objects without specifying concrete classes. Family refers to a group of similar type of objects. The calling code is decoupled from factory that creates products. The actual implementation defines interface that all concrete factories must implement which consist of a set of methods for producing products. Often methods of abstract factories are implemented as factory methods. In general, the abstract factory pattern implementation relies on composition rather than inheritance (Shalloway & Trott, 2004).

From the class diagram in the screencast, there are several classes that participate in the abstract factory pattern. 
- AbstractFactory – This declares an interface for operations that creates the abstract products
- ConcreteFactory – This implements the operations in to create concrete products
- AbstractProduct – This is an interface that for a certain type of product object
- Product – This part of the design defines a product to be created by the complimentary ConcreteFactory and implements the AbstractProduct
- Client – this class uses the interfaces declared by AbsractProduct and AbstractFactory

## System Implementation
Though one of the drawbacks of the abstract factory design pattern is the extra complexity and writing the code during the initial stages, the use of this pattern makes it conceivable to swap the concrete classes without changing the client code even at runtime. With this knowledge, the abstract factory design can be applied to the GetITGood scenario.

## Lessons Learned
Implementing the abstract factory design method takes some practice and patience. Because more code is usually needed, it is not necessary to rush through the process. When I initially implemented the design and tested it, I frequently ran into an error reading *“Exception in thread “main” java.lang.NullPointerException"*. This error was caused by a misspelling or accidently swapping product names e.g. “santafe” in the place of “acadia” and vice-versa. Copying and pasting code is very convenient but any programmer must be sure that they are making the correct changes to the code to avoid confusion and frustration.

When first learning the abstract factory design, it can be a little intimidating. In class we used the international e-commerce example which helped me comprehend this design pattern better. Much like the abstract factory, coding requires you to continuously build upon a learned concept or in this case a class. I understand the importance of studying design patterns. Design patterns are a very similar technology to object-oriented technology.

The bottom line with programming is that it takes practice and an optimistic approach to accomplish objectives. Practicing java programming helps understand the syntax and the relationships better. Having a great mindset is another key ingredient in successfully writing java code. If the mindset is in doubt or frustrated, most likely the programmer won’t go anywhere with their code and that comes from self-reflection. If you believe it, then you will see it.
