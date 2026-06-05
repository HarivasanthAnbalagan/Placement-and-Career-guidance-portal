function showRoadMap() {

    let id = document.getElementById("id").value;
    let name = document.getElementById("name").value;
    let department = document.getElementById("department").value;
    let cgpa = document.getElementById("cgpa").value;
    let year = document.getElementById("year").value;

    let roadmap = "";

    if (year == 1) {

        roadmap = `
        <h3>First Year RoadMap</h3>
        <ul>
            <li>Communication Skills</li>
            <li>Spoken English</li>
            <li>Basic Aptitude</li>
            <li>MS Office</li>
            <li>Introduction to Programming</li>
        </ul>
        `;
    }

    else if (year == 2) {

        roadmap = `
        <h3>Second Year RoadMap</h3>
        <ul>
            <li>Aptitude</li>
            <li>Logical Reasoning</li>
            <li>Verbal Ability</li>
            <li>Data Structures Basics</li>
        </ul>
        `;
    }

    else if (year == 3) {

        roadmap = `
        <h3>Third Year RoadMap</h3>
        <ul>
            <li>Core Java</li>
            <li>OOP Concepts</li>
            <li>DBMS</li>
            <li>SQL</li>
            <li>HTML</li>
            <li>CSS</li>
            <li>JavaScript</li>
            <li>Git & GitHub</li>
        </ul>
        `;
    }

    else {

        roadmap = `
        <h3>Fourth Year RoadMap</h3>
        <ul>
            <li>Placement Preparation</li>
            <li>Mock Interviews</li>
            <li>Coding Practice</li>
            <li>Resume Building</li>
        </ul>
        `;
    }

    document.getElementById("output").innerHTML = `
        <h2>Student Profile</h2>
        <p><b>ID:</b> ${id}</p>
        <p><b>Name:</b> ${name}</p>
        <p><b>Department:</b> ${department}</p>
        <p><b>CGPA:</b> ${cgpa}</p>
        <p><b>Year:</b> ${year}</p>

        ${roadmap}
    `;
}


function showCompanies() {

    document.getElementById("output").innerHTML = `
        <h2>Company Preparation</h2>

        <h3>TCS - Java Full Stack Developer</h3>

        <b>Skills Required:</b>
        <ul>
            <li>Core Java</li>
            <li>OOP Concepts</li>
            <li>Collections</li>
            <li>Exception Handling</li>
            <li>JDBC</li>
            <li>MySQL</li>
            <li>HTML</li>
            <li>CSS</li>
            <li>JavaScript</li>
            <li>Spring Boot</li>
        </ul>

        <b>Interview Questions:</b>
        <ol>
            <li>What is JVM?</li>
            <li>Difference between JDK and JRE?</li>
            <li>What is Collection Framework?</li>
            <li>What is Spring Boot?</li>
            <li>What is REST API?</li>
        </ol>

        <hr>

        <h3>Infosys - System Engineer</h3>

        <b>Skills Required:</b>
        <ul>
            <li>Java or Python</li>
            <li>SQL</li>
            <li>DBMS</li>
            <li>Operating Systems</li>
            <li>Aptitude</li>
        </ul>

        <hr>

        <h3>Accenture - Associate Software Engineer</h3>

        <b>Skills Required:</b>
        <ul>
            <li>Java</li>
            <li>SQL</li>
            <li>Cloud Basics</li>
            <li>Aptitude</li>
        </ul>

        <hr>

        <h3>Cognizant - Programmer Analyst</h3>

        <b>Skills Required:</b>
        <ul>
            <li>Java</li>
            <li>DSA</li>
            <li>SQL</li>
            <li>Web Development</li>
        </ul>
    `;
}

function checkEligibility() {

    let cgpa = parseFloat(document.getElementById("cgpa").value);

    let companies = "";

    if (cgpa >= 8.5) {

        companies = `
        <h2>Eligible Companies</h2>
        <ul>
            <li>Google</li>
            <li>Microsoft</li>
            <li>Amazon</li>
            <li>TCS Digital</li>
            <li>Infosys Specialist Programmer</li>
        </ul>
        `;
    }

    else if (cgpa >= 7.0) {

        companies = `
        <h2>Eligible Companies</h2>
        <ul>
            <li>TCS</li>
            <li>Infosys</li>
            <li>Accenture</li>
            <li>Cognizant</li>
            <li>Wipro</li>
        </ul>
        `;
    }

    else {

        companies = `
        <h2>Recommendation</h2>
        <p>Improve CGPA and focus on skill development.</p>
        `;
    }

    document.getElementById("output").innerHTML = companies;
}