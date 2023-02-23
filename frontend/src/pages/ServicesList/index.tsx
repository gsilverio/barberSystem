import "./styles.css";
import ServiceCard from "../../components/ServiceCard";
import { Service } from "../../types/service";
import { Link } from "react-router-dom";
const ServiceList = () => {
  const service: Service = {
    id: 1,
    nameOfService: "CORTE CABELO",
    price: 31.0,
    imgUrl:
      "https://github.com/gsilverio/barberSystem/blob/main/resources/images/corteCabelo.png?raw=true",
  };

  return (
    <>
      <div className="container my-4">
        <div className="row">
          <div className="col-xl-3">
            <Link to="/kindofservice/1">
              <ServiceCard service={service} />
            </Link>
          </div>
        </div>
      </div>
    </>
  );
};

export default ServiceList;
