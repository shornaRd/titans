Feature: user login

Scenario Outline: user login into amazon account


Given  i am on the amazon home page

When  i click on the sign in button in the homepage
And  i enter "email_adderss" in the email input bar
And  i click on the continue button 
And  i enterd the "<password>"  in the password input bar
And  i click on the sign in button

Then i loggin in to my account successfully 


Examples:

   |email address | password |
   |abc@gmail.com |1234 |
   |deg@gmail.com | 4567|