import manageUsers from './manageUsers.js';
import usuarios from './users.js';

window.addEventListener("DOMContentLoaded", () => {
    // console.log(usuarios[0].nome);

    manageUsers.showAllUsers(usuarios);
    manageUsers.showUsersGender(usuarios, "M");
});