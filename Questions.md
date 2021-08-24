Questions: 

1. Is there any limit on the number of each sized dogs? For example, is it valid to have all the 30 large dogs or is there any licensing limit? 

2. What should the function return in case of “leftover supply from previous month” is more than “what is needed for the current number of dogs”? 

In my opinion as an owner of the dog shelter, I would expect the function to return “0” since I already have enough supply to feed the dogs hence, I wrote the test case with an expected result of “0” in this case and it fails at this time, but AC doesn’t explicitly state this. 

3. Should the function return the food to be ordered in any specific decimal point precision? 

4. Should the function return an error or exception for the invalid input such as negative number for the number of dogs or remaining food from last month?  

Currently I assumed the function should return an exception for the negative inputs and wrote error test cases to fail in case of no exception. 

5. Is it always 20% more or would there be need for more than 20% need in any specific occasion? If there maybe occasions of more than 20% need, AC needs to be modified to state it so that the function can be implemented to parameterize this. Also, more test cases can be added to verify the correct result 

6. Based on the example provided, I assumed the food needs provided are for one month’s consumption by each size of the dog and not for a single day. Can you please clarify if my assumption is valid? 

If not, AC might need to be modified to state it clearly. Also, if the needs are per day, AC might need to state we need to include holidays and weekends in the calculation. 

 