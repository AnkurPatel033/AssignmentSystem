/**
 * 
 */

function fetchCourseDetails() {
	var url = "http://localhost:8071/assignmentt/getcourse/";
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var jsonData = JSON.parse(xmlHttp.responseText);
				var select = document.getElementById('course');
				var option = "";

				for (i = 0; i < jsonData.length; i++) {
					// create new option element
					var opt = document.createElement('option');

					// create text node to add to option element (opt)
					opt.appendChild(document.createTextNode(jsonData[i][1]));

					// set value property of opt
					opt.value = jsonData[i][0];

					// add opt to end of select box (sel)
					select.appendChild(opt);
				}

			} else if (xmlHttp.status == 404) {
				alert("Invalid data");
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();
}

function onChangeCourse() {
	var url = "http://localhost:8071/assignmentt/gettopic/"	+ $('#course').val();
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var jsonData = JSON.parse(xmlHttp.responseText);
				
				var select = document.getElementById('topic');
				var option = "";
				// Clear drop down list
				$(select).empty();  
				for (i = 0; i < jsonData.length; i++) {
					// create new option element
					var opt = document.createElement('option');

					// create text node to add to option element (opt)
					opt.appendChild(document.createTextNode(jsonData[i]));

					// set value property of opt
					//opt.value = jsonData[i][0];
					//will return topic name
					opt.value = jsonData[i];


					// add opt to end of select box (sel)
					select.appendChild(opt);
				}
				

			} else if (xmlHttp.status == 404) {
				alert("Invalid data");
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();
	/* alert("Data is: "+$('#course').val()); */
}


