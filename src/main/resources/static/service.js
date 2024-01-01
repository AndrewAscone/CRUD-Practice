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
}