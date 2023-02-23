import "./styles.css";

const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-md navbar-container">
      <div className="container-fluid">
        <a href="link" className="nav-logo-text">
          BarberSystem
        </a>

        <div className="collapse navbar-collapse">
          <ul className="navbar-nav offset-md-2 main-menu">
            <li>
              <a href="link">Services List</a>
            </li>
            <li>
              <a href="link">Users List</a>
            </li>
            <li>
              <a href="link">ServiceCard</a>
            </li>
            <li>
              <a href="link">UserCard</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
