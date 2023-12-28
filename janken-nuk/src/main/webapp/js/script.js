'use strict';

const hands = document.getElementsByClassName('hand');
for (let i = 0; i < hands.length; i++) {
	hands[i].addEventListener('click', function(e) {
		this.style.width = '120px';
		console.log('click');
	})
}
