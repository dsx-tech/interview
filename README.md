# interview
Hi,
We are glad to see you here! 
We suggest you to implement some test issues as describe below.

Steps:
- 
1. Checkout snapshot of project
2. Implement described tasks
3. Make zip snapshot with name <first name>-<last name>-<YYYY-MM-DD>.zip
4. Send snapshot to contact email 
5. Wait feedback

Task:
-
Implement application (with java 8, gradle, and some additional frameworks) which provide REST endpoint for transfer money between accounts.
Target:
- Best performance in the multithreading environment
- Data consistency at any time (non negative balances on accounts for example)

We allow some simplification for speed up of time for development:
- data persistence to data base is not required 
- any authorization is not required
 

List of tasks:
-
1. Build project 
2. Add multithreading pool into TransferServiceImpl  
3. Implement method TransferServiceImpl.transfer
4. Add REST endpoint startup into Main and link it with TransferService
5. Add some tests into TransferServiceTest
