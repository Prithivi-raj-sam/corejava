/**
 * 
 */
let myNum1= 12435.4643;
myNum1=myNum1.toLocaleString("en-US",{style: "currency", currency: "USD"});
// in output it will write like 12,435.4643
console.log(myNum1);
let myNum2= 12322.564363;
myNum2=myNum2.toLocaleString("hi-IN",{style: "currency", currency: "INR"}); // Hindi
console.log(myNum2);
let myNum3=745736.4365;
myNum3=myNum3.toLocaleString("de-DE",{style: "currency", currency: "EUR"}); // standard german
console.log(myNum3);
let myNum4=0.63;
myNum4=myNum4.toLocaleString(undefined ,{style: "percent"});
console.log(myNum4);
let myNum5=100;
myNum5=myNum5.toLocaleString(undefined ,{style: "unit", unit: "celsius"});
 // we can also use kilometer,kelvin like all units
console.log(myNum5);