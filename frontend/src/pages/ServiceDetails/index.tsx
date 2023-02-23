import ServicePrice from "../../components/ServicePrice";
import "./styles.css";
const ServiceDetails = () => {
  return (
    <>
      <div className="base-card service-details-container">
        <div className="img-container">
          <img
            src="https://user-images.githubusercontent.com/33436010/220815758-8536162a-e8e8-4ee0-865a-ac8ae04da042.png"
            alt=""
          />
        </div>
        <div className="name-price-container">
          <h1>Nome</h1>
          <ServicePrice price={35} />
        </div>
      </div>
    </>
  );
};

export default ServiceDetails;
