import { Link } from "react-router-dom";
import "./styles.css";

const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-md navbar-container">
      <div className="container-fluid">
        <Link to="/" className="nav-logo-text">
          BarberSystem
        </Link>

        <div className="collapse navbar-collapse">
          <ul className="navbar-nav offset-md-2 main-menu">
            <li>
              <Link to="/kindofservice">Services List</Link>
            </li>
            <li>
              <Link to="/userlist">Users List</Link>
            </li>
            <li>
              <Link to="/servicecard">ServiceCard</Link>
            </li>
            <li>
              <Link to="/usercard">UserCard</Link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
