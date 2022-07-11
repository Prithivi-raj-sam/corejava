/**
 * 
 */
//console.log("SamayaPuram mariyamman Thunai");
let name=window.prompt("enter your input");
document.getElementById("firstBtn").onclick = function(){
	const mycheckbox = document.getElementById("firstBtn");
	if(mycheckbox.checked){
		console.log("you are subscribed");
	}
	else{
		console.log("you are not subscribed");
	}
}
// one button should have one onclick method, means should have one functionality
function a(){
	const visaBtn= document.getElementById("visaBtn");
	const mastercardBtn= document.getElementById("mastercardBtn");
	const paypalBtn =document.getElementById("paypalBtn");
	if(visaBtn.checked){
		console.log("you are paying with visa!")
	}
	else if(mastercardBtn.checked){
		console.log("you are paying with mastercard")
	}
	else if(paypalBtn.checked){
		console.log("you are paying with paypal")
	}
	else {
		console.log("please select one payment method!")
	}
}