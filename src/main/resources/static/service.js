class Band {
    constructor(id, bandName, bandGenre, bandYear){
        this.id = id;
        this.bandName = bandName;
        this.bandGenre = bandGenre;
        this.bandYear = bandYear;
    }
}

const updateDisplay = (response) => document.getElementById("output").innerText = JSON.stringify(response);

function create(event){
    event.preventDefault();

    const bandIdElement = document.getElementById("band-id");
    const bandNameElement = document.getElementById("band-name");
    const bandGenreElement = document.getElementById("band-genre");
    const bandYearElement = document.getElementById("band-year-formed");

    const bandIdValue = bandIdElement.value;
    const bandNameValue = bandNameElement.value;
    const bandGenreValue = bandGenreElement.value;
    const bandYearValue = bandYearElement.value;
    const band = new Band(bandIdValue, bandNameValue, bandGenreValue, bandYearValue);

    const bandData = JSON.stringify(band);
    console.log(bandData);

    $.ajax({
        type: "POST",
        crossDomain: true,
        headers: {
            'Accept':'application/json',
            'Content-Type':'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        url: "/create",
        data: bandData,
        dataType: "JSON",
        success: function(response){
            updateDisplay(response)
        },
        error: function(error){
            updateDisplay(error)
        }
    });
}

function readById(event) {
    event.preventDefault();

    const bandIdElement = document.getElementById("band-id");
    const bandIdValue = bandIdElement.value;

    $.ajax({
        type: "GET",
        crossDomain: true,
        headers: {
            'Accept':'application/json',
            'Content-Type':'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        url: "/read/" + bandIdValue,
        dataType: "JSON",
        success: function(response) {
            updateDisplay(response);
        },
        error: function(error) {
            updateDisplay(error);
        }
    });
}

function readAll(event){
    event.preventDefault();

    $.ajax({
        type: "GET",
        crossDomain: true,
        headers: {
            'Accept':'application/json',
            'Content-Type':'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        url: "/readAll",
        dataType: "JSON",
        success: function(response) {
            updateDisplay(response);
        },
        error: function(error) {
            updateDisplay(error);
        }
    });
}

function update(event) {
    event.preventDefault();

    const bandIdElement = document.getElementById("band-id");
    const bandNameElement = document.getElementById("band-name");
    const bandGenreElement = document.getElementById("band-genre");
    const bandYearElement = document.getElementById("band-year-formed");

    const bandIdValue = bandIdElement.value;
    const bandNameValue = bandNameElement.value;
    const bandGenreValue = bandGenreElement.value;
    const bandYearValue = bandYearElement.value;
    const band = new Band(bandIdValue, bandNameValue, bandGenreValue, bandYearValue);

    const bandData = JSON.stringify(band);
    console.log(bandData);

    $.ajax({
        type: "PUT",
        crossDomain: true,
        headers: {
            'Accept':'application/json',
            'Content-Type':'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        url: "/update/" + bandIdValue,
        data: bandData,
        success: function(response) {
            updateDisplay(response);
        }
        error: function(error) {
            updateDisplay(error);
        }
    });
}