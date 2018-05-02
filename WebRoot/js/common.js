		function $(id) {
			return document.getElementById(id);
		}

		function show(id){
			$(id).style.display = "block";
		}

		function hide(id) {
			$(id).style.display = "none";
		}
		
		function setLocation(id,left,top) {
			$(id).style.left = left +"px";
			$(id).style.top = top +"px";
		}