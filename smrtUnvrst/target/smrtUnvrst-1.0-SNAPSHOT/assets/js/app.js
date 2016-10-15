	document.addEventListener("DOMContentLoaded", ready);
		 function ready() {
			if(!Modernizr.meter){
				alert('Извините, но ваш браузер не поддерживает индикатор прогресса HTML5.');
			} else {
				var progressbar = $('#progressbar'),
					max = progressbar.attr('max'),
					current = progressbar.attr('current'),
					time = (100/max)*5,	
			        value = progressbar.val();

			    var loading = function() {
			        value += 1;
			        addValue = progressbar.val(value);
			        
			        $('.progress-value').html(value + '%');

			        if (value == current) {
			            clearInterval(animate);			           
			        }
			    };

			    var animate = setInterval(function() {
			        loading();
			    }, time);
			};
		};