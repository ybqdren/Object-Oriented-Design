# 1.The first stage of the two-stage design process is _______ design. 
> Hint: This stage has activities like creating CRC cards, talking with the customer about their requirements, and creating mockups. 

- conceptual
   - The correct answer is concept or conceptual design. This is the stage before technical design, where you will solicit customer requirements and use this to create a working conceptual design, using mockups and other early design techniques.



# 2.The second stage of the two-stage design process is ________ design. 
> Hint: This is when you will define the structure of the code and start turning your mockups into classes.

- technical
   - The correct answer is technical design. This is the stage at which the developers will start to turn the conceptual design into a more precise technical design. They could do this by using the UML design language, by specifying which methods will be coded for each class, etc.



# 3.Which of these conceptual design techniques will help you analyze the problem space to determine classes for your object-oriented software? Choose the two correct answers.

- tradeoffs
- **mockups**
   - Correct. Mockups will help you visualize your problem space in the earliest stages.
- CRC
- requirements
   - Incorrect. Requirements will no doubt be a part of conceptual design but their primary role is not to decompose the problem into classes.




# 4.During conceptual design, once the problem is mapped into components, what are the other two critical pieces of information that you must specify for these classes or components? Choose the two correct answers.

- **responsibilities**
   - Correct. Responsibilities are what the component will do or keep track of.
- **collaborators** 
   - Correct. Collaborators are other pieces of the software that your component will interact with to fulfill its function!
- methods
- abstract data types






# 5.You are writing the CRC card for a Bear component. Choose the two responsibilities.

- den
- camper
- **hunger**
   - Correct. Hunger is not as obvious because it does not have a verb, but you can think of it like this: the bear component needs to keep track of its hunger.
- **eat berries**
   - Correct. Eat berries is something bears are known to do.





# 6.You are writing the CRC card for a Bear component. Choose the three collaborators.

- den
- **tree**
   - Correct. A tree is a component that a bear may interact with.
- computer
- **bear**
   - Correct. Objects can and often do interact with other objects of their class!
- guitar
	没有选择所有正确的答案





# 7.You create an object that represents a user, storing important information about them such as their preferences. What kind of object is this?

- **entity** 
   - Correct! Entity objects often represent real-world objects.
- control
- boundary
- client




# 8.You create an object that represents a dialog box. It creates buttons and text fields, etc, for the user to interact with, and it logs those interactions. What kind of object is this?

- display
   - Incorrect. This is not one of the three object types.
- interaction
   - Incorrect. This is not one of the three object types.
- entity
   - Incorrect. This is not an entity object.
- control 
   - Incorrect. This is not a control object.
- **boundary**
   - Correct! This is a boundary object, because it interfaces with another system (the user)





# 9.You create an object that compares values from two different sources. It then updates the smaller value to be equal to the larger one. What kind of object is this?

- update
- entity
- **control** 
   - Correct! This is a control object, because it coordinates the activities of other objects.
- repository




# 10.Which of these is an example of a quality tradeoff?

- Limiting features knowing that they can be added later
   - Incorrect. The term tradeoff implies that you get a benefit in exchange for a lesser outcome.
- Not delivering key features so that deadlines can be met
- Adding preferences that allow users to switch some features on and off 
   - Incorrect. The term tradeoff implies that you get a benefit in exchange for a lesser outcome.
- **Adding security knowing it will reduce speed** 
   - Correct. A tradeoff happens when to make an improvement you must sacrifice some other quality.







# 11.What is the term for reducing a class or object to its inputs and outputs in modelling?

- filter thinking
- **black box thinking**
   - Correct! This is called black box thinking, because you don't care what happens inside at this point, only the inputs and outputs.
- process thinking
- pipe thinking 




# 12.Which one of these classes is in most need of being decomposed?

- Book
- **Store**
   - Correct! A store has lots of responsibilities, including tracking orders, inventory, employees, customers, etc. This class needs to be decomposed.
- Student
- Order 





# 13.In order to provide good encapsulation, fill-in-the-blanks on this UML class diagram: (Replace the underscores _ from top to bottom with minus signs ("-") or plus signs ("+"); your answer will be a string of six + or - signs with no spaces)

--++++
> The correct answer is "--++++". In other words, the variables are declared private so they cannot be seen or changed from outside the class. Instead, getter and setter methods are specified.​





# 14.You are writing a simple soccer video game. Select the best example of proper abstraction:

- **a)**
   - Correct! This class contains only details that are important in the context (a soccer video game).
- b)
   - Incorrect. This class contains a variable that is not important in the context of a soccer game: favouriteFood. Remember that removing unnecessary details is part of abstraction.
- **c)**
   - Incorrect. This class contains a variable that is not important in the context of a soccer game: manufacturer. Remember that removing unnecessary details is part of abstraction.
- d)
   - Incorrect. This class contains variables that are not important in the context of a soccer game: mother and father. Remember that removing unnecessary details is part of abstraction.






# 15.Which design principle enables developers to follow the guideline D.R.Y. ("Don't Repeat Yourself"):

- abstraction
- encapsulation
   - Incorrect. Encapsulation is an important design principle but is not used for D.R.Y.
- decomposition
- **generalization**
   - Correct! Generalization (along with other object-oriented tools) allows developers to follow the D.R.Y. principle!






# 16.Which of these UML class diagrams shows an association relationship?

- **b)**
   - Correct! A simple association relationship is shown with a plain line, often with numbers indicating how many of each object can be associated.





# 17.Which of these UML class diagrams depicts an aggregation ("has-a") relationship between the two classes?

- **c)**
   - Incorrect. An open arrow does not indicate an aggregation relationship.






# 18.Which of these UML class diagrams depicts a composition, or a strong "has-a" relationship?

- **d)**
   - Correct! A filled diamond indicates a composition - or strong "has a" - relationship.






# 19.Select the object pairing that has an association relationship:

- Tree - Root
- Book - Page
- **Hiker - Trail** 
   - Correct! The hiker and trailer are associated but not dependent on each other.
- Coffee - Water





# 20.Select the object pairing that has an aggregation relationship:

- **Stapler - Staple** 
   - Correct! the stapler and staples can exist independently but usually the stapler aggregates staples.
- Book - Page 
- Pie - Crust
- Car - Road
   - Incorrect. These two objects are more independent than in an aggregation relationship.





# 21.Select the object pairing that has a composition relationship:

- **Book - Page**
   - Correct. A book must have pages!
- Tea - Sugar
- Record Player- Record - 
- Bear - Forest

# 22.Choose the two answers that correctly complete the following sentence:
**"We say that a class has low cohesion if..."**

- **...its purpose is unclear.**
   - Correct. Cohesion is how well a class is directed toward a clear, singular purpose.
- **...it tries to encapsulate too many unrelated responsibilities.**
   - Correct. Cohesion is the degree to which a class is directed toward one purpose. Giving it unrelated responsibilities reduces cohesion. 
- ...it does not have all the necessary parts, i.e. it is incomplete.
   - Incorrect. Though this is a problem, it is not cohesion. 
- ...connects to many other classes.



# 23.Two classes are tightly coupled. What are some ways you might be able to tell? Choose the two correct answers.

- **In order to understand one class, you need to open up the other to look at the implementation**
   - Correct. This is usually a sign that the coupling is too tight; instead, the interfaces should be clear and interactions limited.
- They can easily be swapped with different implementations of the same class
- Their interactions are limited and controlled
- **They are very highly reliant on each other**
   - Correct. Coupling refers to how deeply integrated different components are. Tight coupling means the components are deeply integrated, which is not desirable because it makes it more difficult to make changes.





# 24.How can you apply the principle of Separation of Concerns in object-oriented programming?

- **Separate objects or components according to their role in the software** 
   - Correct! Each object or component should have a fairly specific role or concern in the software which is separate from the concerns of other objects.
- Ensure classes are only concerned with their own data
- Separate data and actions (methods) into different classes
- Split developers into teams that each deal with different parts of the software




# 25.Which of these violates Liskov's Substitution Principle?



- **an operation in the superclass is replaced by a different operation in the subclass**
   - Correct! This directly violates Liskov's substitution principle, which is a useful test to identify poor uses of inheritance.
- subclasses specify the abstract methods of the superclass
   - Incorrect. This is a normal and expected use of inheritance
- the subclass adds behaviour
   - Incorrect. This is a normal and expected use of inheritance.
- the superclass is too general
   - Incorrect. This may be a problem but it is unrelated to Liskov's principle!





# 26.For which of these situations would you use a sequence diagram?

- To show the relationship between classes 
- To show all of the different processes of your program.
- To show the different modes that your program can be in.
- **To show the collaborative behaviour of objects in your program.**
   - Correct! This is the best use of a sequence diagram.







# 27.Choose the correct state diagram for a car which has a state called "HasGas:"

- **c)**
   - Correct! The state goes at the top, variables in the middle, and activities (including exit and entry activities) in the bottom.​

没有图
​

# 28.Which of these elements represents a termination in a UML State diagram?

- **a)**
   - Correct! This represents a termination







# 29.What is the purpose of model checking?

- To verify that the technical implementation matches conceptual mockups 
   - Incorrect. The technical implementation cannot be programmatically tested against conceptual mockups, which are informal representations.
- **To check the software for errors before release** 
   - Correct! this is the point of Model Checking.
- To verify that the conceptual model of your software matches the customer's requirements.
   - Incorrect. Model Checking is a test of the technical design.
- To test for user-reported bugs 







# 30.What is an abstract data type?

- variables that are assigned a type (i.e. integer, double) but does not yet have a value assigned. 
   - Incorrect. This is not what abstract data type means.
- a data-centric class
   - Incorrect. This is not what abstract data type means.
- a data type that cannot be used directly but must be implemented as an interface 
- **a type of data defined by the developer rather than the language.** 
   - Correct! Abstract data types are structured by the developer. They eventually evolved into classes.













































































