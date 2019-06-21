/**
 * 
 */

function sessionCheck()
{	
	 alert("Invalid data");
	 
	 var ss='<%= Session["userEntity"] %>';
	/* var user=${sessionScope.userEntity.fname};
	alert(user);*/
	 alert(ss);
	
	/*
	var url = "http://localhost:8071/assignmentt/checkSession/";
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var jsonData = JSON.parse(xmlHttp.responseText);
                 var i=true;
				 if (i==jsonData) {
				        window.location = "Search.jsp";
				    }
				

			} else if (xmlHttp.status == 404) {
				alert("Invalid data");
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();*/
	
}
