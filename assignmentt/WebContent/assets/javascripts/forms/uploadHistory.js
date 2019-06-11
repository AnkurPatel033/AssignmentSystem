/**
 * 
 */
function fetchUploadHistoryDetails() {
	
	alert("dataload");
	var url = "http://localhost:8071/assignmentt/uploadAssignHistory/";
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var jsonData = JSON.parse(xmlHttp.responseText);
				var select = document.getElementById('pid');
				/*var option="";
				
				for(i=0;i<jsonData.length;i++)
					{
					// create new option element
					var opt = document.createElement('option');

					// create text node to add to option element (opt)
					opt.appendChild( document.createTextNode(jsonData[i][1]) );

					// set value property of opt
					opt.value = jsonData[i][0]; 

					// add opt to end of select box (sel)
					select.appendChild(opt); 
//					option+='<option value='+jsonData[i][0]+'>'+jsonData[i][1]+'</option>'
					 select += '<option value="' + jsonData[i].pin + '">' ;
//					console.log(jsonData[i]);
					}*/
				alert("alert");
//				select.innerHtml=option;
			} else if (xmlHttp.status == 404) {
				alert("Invalid data");
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();
}
