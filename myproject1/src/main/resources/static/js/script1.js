
function NavLink(){

    let ulTag = document.querySelector("#list_nav_link");
    let item = "";
    const navigations = [
        {
            name:"HOME",
            href:"/home",
        },
    ];

    for (let i = 0; i < navigations.length; i++){

        item += `
          <li class="nav-item">
            <a class="nav-link" href="${navigations[i].href}">${navigations[i].name}</a>
          </li>
        `;
    }

    return ulTag.innerHTML += item;
}


function NavDropdown(){

    let ulTag = document.querySelector("#list_nav_dropdown");
    let item = "";
    const navigations = [
        {
            name:"EVENT",
            list_name:"List event",
            href_list:"/events",
        },
        {
            name:"CLUB" ,
            list_name:"List club",
            href_list:"/clubs",
            name_create:"Create club",
            href_create:"/clubs/create",

        },
        {
            name:"POST" ,
            list_name:"List post",
            href_list:"/posts",
            name_create:"Create post",
            href_create:"/posts/create",

        },
    ];

    for (let i = 0; i < navigations.length; i++){

        let createItem = "";

        if (navigations[i].name_create !== undefined) {

            createItem = `<li><a class="dropdown-item" href="${navigations[i].href_create}" >${navigations[i].name_create}</a></li>`;
        }

        item += `
           <li class="nav-item dropdown">
            <button class="btn btn-dark dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
              ${navigations[i].name}
            </button>
            <ul class="dropdown-menu dropdown-menu-dark">
              <li><a class="dropdown-item" href="${navigations[i].href_list}"> ${navigations[i].list_name}</a></li>
              <div>${createItem}</div> 
            </ul>
          </li>
        `;
    }

    return ulTag.innerHTML += item;
}

function Modal(){

    let modalTag = document.querySelector("#modal_body");
    let modal = "";
    const navigations = [
        {
            name:"EVENT",
            list_name:"List event",
            href_list:"/events",
            array: [function () {return "The event object navigation.";}()]
        },
        {
            name:"CLUB" ,
            list_name:"List club",
            href_list:"/clubs",
            name_create:"Create club",
            href_create:"/clubs/create",
            array: [function () {return "The club object navigation.";}()]
        },
        {
            name:"POST" ,
            list_name:"List post",
            href_list:"/posts",
            name_create:"Create post",
            href_create:"/posts/create",
            array: [function () {return "The post object navigation.";}()]
        },
    ];

    for (let i = 0; i < navigations.length; i++){

        let createItem = "";

        if (navigations[i].name_create !== undefined) {

            createItem = `<li><a id="item_create" class="dropdown-item" href="${navigations[i].href_create}" >${navigations[i].name_create}</a></li>`;
        }

        modal += `
          <ul class="list-nav">
              <div class="mb-3">
                <li class="nav-item dropdown">
                  <button class="btn btn-dark" data-bs-toggle="dropdown" aria-expanded="false" >
                    ${navigations[i].name}
                  </button>
                  <ul class="btn-w dropdown-menu dropdown-menu-dark">
                    <li>
                      <a class="dropdown-item" href="${navigations[i].href_list}">
                        ${navigations[i].list_name}
                      </a>
                    </li>
                    <div>
                       ${createItem}
                    </div>
                  </ul>
                </li>
              </div>
          </ul>
        `;
    }

    for (let i in navigations){

        console.log(navigations[i].array[0])
    }

    return modalTag.innerHTML += modal;
}

const App = {

    Modal : Modal,
    NavDropdown : NavDropdown,
    NavLink : NavLink,
}

function $USE(functionName) {

    if (App[functionName] && typeof App[functionName] === 'function') {

        return App[functionName]();

    } else {

        console.warn(`Function ${functionName} not found in App!!!`);
    }
}

$USE("Modal");
$USE("NavDropdown");
$USE("NavLink");