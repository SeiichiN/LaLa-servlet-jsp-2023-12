'use strict';

const hands = document.getElementsByClassName('hand');
for (let i = 0; i < hands.length; i++) {
	hands[i].addEventListener('click', function(e) {
		this.style.width = '120px';
		console.log('click');
	})
}

// 東京(130000)の予報を取得
let url = "https://www.jma.go.jp/bosai/forecast/data/forecast/270000.json";

fetch(url)
    .then(function(response) {
        return response.json();
    })
    .then(function(weather) {
        console.log(weather);
    });
