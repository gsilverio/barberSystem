import "./styles.css";
import UserIcon from "../../assets/images/userIcon.png";

const UserCard = () => {
  return (
    <>
      <div className="base-card user-card">
        <div className="usercard-top-container">
          <img src={UserIcon} alt="" />
        </div>
        <div>
          <h6>Nome</h6>
          <h6>Email</h6>
          <h6>Telefone</h6>
        </div>
      </div>
    </>
  );
};

export default UserCard;
