/**
 * 
 */

function sessionCheck() {

	var url = "http://localhost:8071/assignmentt/checkSession/";
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var jsonData = JSON.parse(xmlHttp.responseText);
				var i = false;
				if (i == jsonData) {
					window.location = "SignIn.jsp";
				}
			} else if (xmlHttp.status == 404) {
				consol.log("Invalid data");
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();

}
