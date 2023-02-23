import "./styles.css";
import Navbar from "../../components/Navbar";
import UserCard from "../../components/UserCard";
import { User } from "../../types/user";
import { Link } from "react-router-dom";
const UserList = () => {
  const user: User = {
    id: 1,
    name: "GUILHERME",
    email: "GUILHERME@GMAIL.COM",
    phone: "6296930508",
  };
  return (
    <>
      <div className="container my-4">
        <div className="row">
          <div className="col-xl-3">
            <Link to="/userlist/1">
              <UserCard user={user} />
            </Link>
          </div>
        </div>
      </div>
    </>
  );
};

export default UserList;
