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
}