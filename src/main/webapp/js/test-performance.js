var wordsTableName = '#words_table td';
var translationsTableName = '#translations_table td';

var wordsTableSelection = false;
var translationsTableSelection = false;

var wordsTableSelectedCell;
var translationsTableSelectedCell;

var word;
var translation;

var controlList = [];
prepareControlList(wordPairs);

$(wordsTableName).click(function () {
    var $tr = $(this).closest('tr');
    var row = $tr.index();
    word = $(wordsTableName).slice(row, row + 1).text();
    if (!passed(word)) {
        if (!(typeof(wordsTableSelectedCell) == "undefined")) {
            wordsTableSelectedCell.removeClass('selected');
        }
        wordsTableSelectedCell = $(wordsTableName).slice(row, row + 1);
        wordsTableSelectedCell.addClass('selected');
        wordsTableSelection = true;
        control();
        isTestComplete();
    }
});

$(translationsTableName).click(function () {
    var $tr = $(this).closest('tr');
    var row = $tr.index();
    translation = $(translationsTableName).slice(row, row + 1).text();
    if (!passed(translation)) {
        if (!(typeof(translationsTableSelectedCell) == "undefined")) {
            translationsTableSelectedCell.removeClass('selected');
        }
        translationsTableSelectedCell = $(translationsTableName).slice(row, row + 1);
        translationsTableSelectedCell.addClass('selected');
        translationsTableSelection = true;
        control();
        isTestComplete();
    }
});

function prepareControlList(testWordsList) {
    for (var i = 0; i < testWordsList.length; i++) {
        var testWord = {first: testWordsList[i].first, second: testWordsList[i].second, pass: false}
        controlList.push(testWord);
    }
}

function control() {
    if (wordsTableSelection && translationsTableSelection) {
        for (var i = 0; i < controlList.length; i++) {
            if (controlList[i].first == word && controlList[i].second == translation) {
                controlList[i].pass = true;
                clear();
            }
        }
    }
    return false;
}

function clear() {
    wordsTableSelection = false;
    translationsTableSelection = false;
    wordsTableSelectedCell.addClass('passed');
    translationsTableSelectedCell.addClass('passed');
}

function passed(controlWord) {
    for (var i = 0; i < controlList.length; i++) {
        if (controlList[i].first == controlWord || controlList[i].second == controlWord) {
            if (controlList[i].pass == true) {
                return true;
            }
        }
    }
    return false;
}

function isTestComplete() {
    for (var i = 0; i < controlList.length; i++) {
        if (!controlList[i].pass) {
            return;
        }
    }
    //alert("Test complete!")
    document.getElementById("massage").innerHTML="Test complete!";
    massageWindow();
}

function massageWindow() {
    var link = $('#massage_window')[0];
    var linkEvent = null;
    if (document.createEvent) {
        linkEvent = document.createEvent('MouseEvents');
        linkEvent.initEvent('click', true, true);
        link.dispatchEvent(linkEvent);
    }
    else if (document.createEventObject) {
        linkEvent = document.createEventObject();
        link.fireEvent('onclick', linkEvent);
    }
}