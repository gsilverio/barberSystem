import "./styles.css";
import CorteCabelo from "../../assets/images/corteCabelo.png";
import Navbar from "../Navbar";
import ServicePrice from "../ServicePrice";
const ServiceCard = () => {
  return (
    <>
      <div className="base-card service-card">
        <div className="card-top-container">
          <img src={CorteCabelo} alt="" />
        </div>
        <div className="card-bottom-container">
          <h6>Nome Serviço</h6>
          <ServicePrice />
        </div>
      </div>
    </>
  );
};

export default ServiceCard;
