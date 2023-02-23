import "./styles.css";
import Navbar from "../../components/Navbar";
import UserCard from "../../components/UserCard";
const UserList = () => {
  return (
    <>
      <Navbar />
      <div className="container my-4">
        <div className="row">
          <div className="col-xl-3">
            <UserCard />
          </div>
          <div className="col-xl-3">
            <UserCard />
          </div>
          <div className="col-xl-3">
            <UserCard />
          </div>
          <div className="col-xl-3">
            <UserCard />
          </div>
          <div className="col-xl-3">
            <UserCard />
          </div>
          <div className="col-xl-3">
            <UserCard />
          </div>
          <div className="col-xl-3">
            <UserCard />
          </div>
          <div className="col-xl-3">
            <UserCard />
          </div>
        </div>
      </div>
    </>
  );
};

export default UserList;
