/*
 *     This project is part of project Dawn, A Data Process Solution.
 *     Copyright (C) 2017, Dawn team<https://github.com/Dawn-Team>.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import Main from "../../theWhiteSail/theWhiteSail.js"
import PMHMain from "./pmhMain.js";

$(document).ready(function () {
    let main = new Main();
    Main.setDraggable();
    main.setSignUp();
    main.setSignIn();
    main.setLogout();
    main.setNewArticle();

    let pmhMain=new PMHMain();
    pmhMain.setAddSometing();
});

