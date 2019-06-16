/**
 * 
 */

function fetchCountryDetails() {
	var url = "https://restcountries.eu/rest/v2/all";

	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var jsonData = JSON.parse(xmlHttp.responseText);
				var sel = document.getElementById('country');
				//var cd=document.getElementById('code');
				for (i = 0; i < jsonData.length; i++) {
					// create new option element
					var opt = document.createElement('option');

					// create text node to add to option element (opt)
					opt.appendChild(document.createTextNode(jsonData[i].name));

					// set value property of opt
					opt.value = jsonData[i].callingCodes;

					// cd.value=jsonData[i].code;

					// add opt to end of select box (sel)
					sel.appendChild(opt);
				}
			} else if (xmlHttp.status == 404) {
				alert("Invaid country Name");
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();
}
function getCountryCode() {
	//alert("hi...GetCountryCode");
	$('#code').val($('#country').val());
}
