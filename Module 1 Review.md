# 1.Which of these are desirable characteristics of a software design? Choose the three correct answers.
- tight coupling  
   - Incorrect. Usually developers try to make their code loosely coupled rather than tightly coupled. 
- **flexible**
   - Correct! We strive to make code flexible, which is to say that it can be adapted for new requirements 
- **maintainability** 
   - Correct! Code should be maintainable, which means the code can be modified or extended easily. 
- **reusability** 
   - Correct! Technical design gets even closer to the actual implementation.



# 2.Identify two outcomes of the design process. Choose the two correct answers.

- **technical design** 
   - Correct! Technical design gets even closer to the actual implementation.

- code implementation
- design plan 
   - Incorrect. This description is kind of like one of the outcomes. Give it another try!
- **conceptual design** 
   - Correct! Conceptual design covers the early part of design, where the problem is translated into a high-level solution. 





# 3.You are writing out a CRC card for a bank machine component. Under which section should you put "Track Cash Remaining."

- Risk
- Collaborator
- Class
- **Responsibility** 
- Correct! One of the responsibilities of this bank machine is to track how much money it has left.



# 4.Which two of these are likely to be a part of conceptual design?

- Methods 
   - Incorrect. Specific methods are part of implementation, though you may talk about Responsibilities.
- **CRC Cards** 
   - Correct! CRC cards are used to get a sense of the classes, components, etc. that your design may have. 
- **Mockups** 
   - Correct! Mockups help the designers decide on relationships between components. 
- Abstract data types
   - Incorrect. This is too close to implementation. 



# 5.When during the design process are you likely to produce CRC cards the most?

- **conceptual design**
   - Correct! CRC cards are most often created and used in conceptual design, especially when the team is almost ready to transition into technical design.
- after releasing the software 
- customer meetings 
- technical design 
   - Incorrect. In technical design, you will turn the CRC cards from conceptual design into class and component diagrams!




# 6.Which of the following are examples of non-functional requirements? Choose the three correct answers.

- **performance**
   - Correct. The speed and responsiveness of a system is often as important as what its actual function is! Remember that the function is the system's reason for being. 
- **security** 
   - Correct. The security of a system and how it protects data may be as important as its function. Remember that the function is the system's reason for being. 
- purpose
- **availability**
   - Correct! That the functions of the system are available for use is as important as the functions themselves. Remember that the function is the system's reason for being. 



# 7.Select the three categories of objects generally present in object-oriented software.

- **boundary** 
   - Correct! Boundary objects typically interface with another system. 
- tool
- **control** 
   - Correct! Control objects manage the interactions of other objects. 
- **entity**
   - Correct! Entity objects are the backbone of the system, and often correspond to real life objects. 



# 8.An object which is responsible for showing data to the user could be considered which category of object?

- **boundary**
   - Correct! This object interacts with another "system" (the user), so it is considered a boundary object. 
- entity
   - Incorrect. A user interface is not generally considered an entity object. 
- control
   - Incorrect. A user interface is not generally considered a control object.
- representation
   - Incorrect. A user interface is not generally considered an entity object.



# 9.You are planning a Professor class as part of your software design. Which of these will you consider a collaborator ? Choose the two correct answers.

- Track Employment Status
- Teach Course
   - Incorrect. This is a responsibility, not a collaborating class.
- **Course**
   - Correct! Typically the Professor will have to teach a course, so a course object is likely to be a collaborator.
- **Student**
   - Correct! The student and professor classes will likely be collaborators.



# 10.What is a requirement of this form called? "As a ____, I want to ____, so that ____".

- **user story**
   - Correct! User stories help you to identify the functional requirements of the system. 
- entity abstraction
- conceptual mockup
- key concept 
   - Incorrect, but this will help you identify key concepts and other important functional requirements. 



# 11.You are a programmer creating software for a bank machine system. Which section of a CRC card for the bank machine component will the "User" go into?

- Object
   - Incorrect. This is not a section of the CRC card. 
- Class
   - Incorrect. A CRC card for a bank machine component would have Bank Machine as its class. 
- Responsibility
   - Incorrect. Responsibilities are usually described with verbs, like insert card, or implied verbs, like (track) remaining cash. 
- Collaborator 
   - Incorrect. A CRC card for a bank machine component would have Bank Machine as its class. 

这道题好像就没有正确答案！
​

# 12.During conceptual design, you will talk about... (Choose the three correct answers):

- **tradeoffs**
   - Correct. Every design decision involves trade-offs, even in the early stages of design. 
- technical diagrams
- **requirements** 
   - Correct! Customer requirements of what the system should be and do are the start for all discussions of the design. 
- **mockups**
   - Correct. Mockups are important for customer communication and to start to think about the architecture. 
