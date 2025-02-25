const line1 = "Hello Programming 2";
const line2 = "Jhane Rose U. Sadicon";
const line3 = "24-2028-129";

const contentDiv = document.querySelector('.content');

// Loop through the lines and append them as paragraphs
[line1, line2, line3].forEach(line => {
    const paragraph = document.createElement('p');
    paragraph.textContent = line;
    contentDiv.appendChild(paragraph);
});
