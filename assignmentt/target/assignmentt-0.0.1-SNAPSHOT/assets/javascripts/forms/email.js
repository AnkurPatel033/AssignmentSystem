function emailValidation()
{
   
	var validateEmail=document.getElementById("email").value;
	console.log(validateEmail);
    var url="http://localhost:8071/assignmentt/email/"+validateEmail+"/";
    var xmlHttp=new XMLHttpRequest();
    xmlHttp.onreadystatechange=function()
	{
		if(xmlHttp.readyState==4 && xmlHttp.status==200)
			{
			console.log(xmlHttp.responseText);
			var id=parseInt(xmlHttp.responseText);
			
			var id=parseInt(xmlHttp.responseText);
			if(id==1)
				{
				console.log("User Already Exist..");
				document.getElementById("emailWarning").innerHTML='User Already exist...';
				}
			else
				{
				document.getElementById('emailWarning').innerHTML='';
				}
			
			}		
	}

	xmlHttp.open('GET',url,true);
	xmlHttp.send();
	
}