wordPairs = [];
mixedWordPairs = [];

wordPairs.addWord = function(firstWord, secondWord) {
    var pair = {first: firstWord, second: secondWord};
    wordPairs.push(pair)
}

mixedWordPairs.mixedFill = function(prototypeWordPairs) {
    for (var i=prototypeWordPairs.length-1;i>=0;i--) {
        var pair = {first: prototypeWordPairs[i].first, second: prototypeWordPairs[i].second};
        mixedWordPairs.push(pair);
    }
    for (var i = 0; i < mixedWordPairs.length; i++) {
        var rand = Math.floor(Math.random() * (mixedWordPairs.length));
        var firstPairTranslation = mixedWordPairs[i].second;
        var secondPairTranslation = mixedWordPairs[rand].second;
        mixedWordPairs[rand].second = firstPairTranslation;
        mixedWordPairs[i].second = secondPairTranslation;
    }
    for (var i = 0; i < mixedWordPairs.length; i++) {
        var rand = Math.floor(Math.random() * (mixedWordPairs.length));
        var firstPairTranslation = mixedWordPairs[i].first;
        var secondPairTranslation = mixedWordPairs[rand].first;
        mixedWordPairs[rand].first = firstPairTranslation;
        mixedWordPairs[i].first = secondPairTranslation;
    }
}

this.publicationAll = function(printWordPairs, tableName) {
    var html ='<table cellpadding="0" class="print_table"> <thead> <tr> <th>English Word</th> <th>Russian Translation</th> </tr> </thead> <tbody>';
    for (var i=0;i<printWordPairs.length;i++){
        if (i%2 == 0) { html += '<tr class = "even">'; }
        else { html += '<tr>'; }
        html+='<td>'+printWordPairs[i].first+'</td>';
        html+='<td>'+printWordPairs[i].second+'</td>';
    }
    html+='</tr></tbody></table>';
    document.getElementById(tableName).innerHTML=html;
}

function createWordTable(divId, tableId, title, tableWordPairs, attributeName){
    var html ='<table cellpadding="0" class="word_table" id=' + tableId + '> <thead> <tr> <th>'+ title +'</th> </tr> </thead> <tbody>';
    for (var i=0;i<tableWordPairs.length;i++){
        if(attributeName == "first") {
            html+='<tr><td>'+tableWordPairs[i].first+'</td></tr>';
        } else if (attributeName == "second") {
            html+='<tr><td>'+tableWordPairs[i].second+'</td></tr>';
        } else {
            return;
        }
    }
    html+='</tr></tbody></table>';
    document.getElementById(divId).innerHTML=html;
}

$(document).ready(function() {
    $('a#massage_window').click( function(event){
        event.preventDefault();
        $('#overlay').fadeIn(400,
            function(){
                $('#modal_form')
                    .css('display', 'block')
                    .animate({opacity: 1, top: '50%'}, 200);
            });
    });

    $('#modal_close, #overlay').click( function(){
        $('#modal_form')
            .animate({opacity: 0, top: '45%'}, 200,
            function(){
                $(this).css('display', 'none');
                $('#overlay').fadeOut(400);
                location.href = $('#massage_window').attr('href');
            }
        );
    });
});