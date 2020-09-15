package bankAcctApp;

public interface IBaseRate {
 // write a method that returns a base rate
 //this rate would normally be defined on an outside source or database.  real world, I'd have to reach out and get that number
 //this is a hard coded benchmark rate simulating the above.
 default double getBaseRate() {
  return 2.5;
 }
}
// this is an api
//
//}
