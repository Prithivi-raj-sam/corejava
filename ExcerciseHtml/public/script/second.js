/**
 * 
 */
document.getElementById("input").onclick = function() {
	switch (true) {
		case grade > 100:
			console.log("enter valid mark! we cannot enter above 100");
			break;
		case grade >= 90:
			console.log("excellent");
			break;
		case grade >= 80:
			console.log("very good");
			break;
		case grade >= 70:
			console.log("good");
			break;
		case grade >= 60:
			console.log("need improvment");
			break;
		case grade >= 50:
			console.log("just pass!, very poor");
			break;
		default:
			console.log("you filed");
	};
}