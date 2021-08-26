# 1.Which of these terms are used to describe coupling? Choose the 3 correct answers.
- **flexibility**
   - Correct! Flexibility is how easily a component can be used for another purpose.
- **degree**
   - Correct! Degree is how much two components are connected
- frequency
- **ease**
   - Correct! Ease is how easily a component can be switched for a different one.
- exposed





# 2.Which is the most desirable?

- low cohesion, tight coupling
- low cohesion, loose coupling 
- high cohesion, tight coupling
- **high cohesion, loose coupling**
   - Think Lego and puzzles



# 3.What are some keywords you might use for information hiding in Java? Select the three correct answers.

- **protected**
   - Correct! This will hide information from all classes except those in the same package or those that extend.
- abstract
- **[none]**
   - Correct! Having no keyword will make the variable or method default to only being accessible by the class and its subclasses.
- **private**
   - Correct! This will hide variables or methods from all other classes.





# 4.What are the best ways to promote Conceptual Integrity in your software? Choose the two correct answers.

- **Planning the architecture of the system**
   - Correct! Planning ahead will allow your team to discuss issues relating to conceptual integrity ahead of time.
- Delegating development of different components to different teams
- **Regular code reviews** 
   - Correct! Regular code reviews will get everyone to think together about the best conventions to use in your software, and allow the team to correct missteps.
- Good commenting 



**​**

# 5.Information Hiding is closely related to one of the core design principles of object-oriented design. Which one?

- generalization
- decomposition
- abstraction
- **encapsulation** 
   - Correct! Information hiding involves hiding away those details that are not important to outside classes. This is closely related to encapsulation.




# 6.Which of these sequence diagrams is correct?

- a)
   - ![image.png](https://cdn.nlark.com/yuque/0/2021/png/12543709/1628301387552-06a74184-b4e8-47d1-b448-fd6b19a609a6.png#clientId=u437dfd42-8e2c-4&from=paste&height=444&id=ub2f891ce&margin=%5Bobject%20Object%5D&name=image.png&originHeight=444&originWidth=655&originalType=binary&ratio=1&size=44619&status=done&style=none&taskId=ue2c48702-35b0-4092-9b30-4536e1d450c&width=655)
- **b)**
   - Correct! This is a complete sequence diagram. 




   - ![image.png](https://cdn.nlark.com/yuque/0/2021/png/12543709/1628301383894-a75fb1f1-49aa-4458-ab5f-df2a1d712343.png#clientId=u437dfd42-8e2c-4&from=paste&height=435&id=u4471b535&margin=%5Bobject%20Object%5D&name=image.png&originHeight=435&originWidth=677&originalType=binary&ratio=1&size=45744&status=done&style=none&taskId=u5ff3debf-52ae-4ca5-a566-aa4547afa5f&width=677)
- c)
   - ![image.png](https://cdn.nlark.com/yuque/0/2021/png/12543709/1628301397499-d64e94e8-8698-491b-95ba-b22b9dc5ef11.png#clientId=u437dfd42-8e2c-4&from=paste&height=457&id=u180659f8&margin=%5Bobject%20Object%5D&name=image.png&originHeight=457&originWidth=654&originalType=binary&ratio=1&size=45273&status=done&style=none&taskId=u539445a7-5fb1-4733-b4f0-5403542c052&width=654)
- d) 
   - ![image.png](https://cdn.nlark.com/yuque/0/2021/png/12543709/1628301414393-c5a91b24-c164-4a2a-81cd-91d960eb2126.png#clientId=u437dfd42-8e2c-4&from=paste&height=432&id=u5f0abf17&margin=%5Bobject%20Object%5D&name=image.png&originHeight=432&originWidth=657&originalType=binary&ratio=1&size=46114&status=done&style=none&taskId=uac25ee2b-abfc-4187-bf11-228ea52518e&width=657)








# 7.What are elements of a state in a State diagram (see diagram)? Choose the three correct answers.

- **state name**
   - Correct! The name of the state is at the top section of a state.
- **state variables**
   - Correct! State variables are manipulated depending on the state.
- **activities**
   - Correct! The activities that are specific to this state are listed, sometimes including those that occur when entering or exiting the state.
- responsibilities
- events





# 8.When is Model Checking conducted?

- After development
- During planning
- During development
   - Incorrect. For Model Checking to be effective it must have a complete program.
- **After deployment**
   - Correct! Model Checking is done after the bulk of the development is finished.







# 9.What are the phases of Model Checking? Choose the 3 correct answers.

- **Analysis Phase**
   - Correct! The counterexamples that were identified in the running phase are analysed to find the causes of the issues and the solution to each.
- **Modeling Phase.** 
   - Correct! First the team creates a model for testing the software in all of its different states.
- Model Simulation
- **Running Phase**
   - Correct! The model checking software identifies counterexamples if there are any.
- Counterexample Phase






# 10.During model checking, what is the name for a violation of the desired properties of the model?

- Redevelopment
- Error
- Model Gap
- **Counterexample**
   - Correct! This is called a counterexample.




# 11.When two processes cannot run because they are waiting on the same resource, it's called…

- State lock
- Transition lock
- Mutual lock
- **Deadlock**
   - Correct! This is called a deadlock.







# 12.Choose the three examples of inheritance used poorly:

- **Inheritance is used to share behaviour without specializing** 
   - Correct! If inheritance is merely used to share behaviour and not much more, consider skipping it altogether and just using the superclass.
- The subclasses inherit methods from the superclass and have their own specific, related methods.
- **A method in the superclass is overwritten with different behaviour by a subclass.**
   - Correct! This violates Liskov's Substitution Principle, which states that a superclass should be able to be substituted by a subclass without error.
- **A subclass inherits methods from the superclass and adds extra, new, unrelated functionality**
   - Correct! If your subclass inherits some behaviour and adds unrelated functionality, it is not very coherent. You should consider decomposing these responsibilities into different interfaces.



 

 

 

 

 

 

 

 

 

 

 

 

 

 
