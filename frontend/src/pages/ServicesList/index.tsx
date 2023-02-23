import "./styles.css";
import Navbar from "../../components/Navbar";
import ServiceCard from "../../components/ServiceCard";
import { Service } from "../../types/service";
const ServiceList = () => {
  const service: Service = {
    id: 1,
    nameOfService: "CORTE CABELO",
    price: 30.0,
    imgUrl:
      "https://drive.google.com/file/d/1G66MVDR-msiRMDA4jF5StGKFl_fv628m/view?usp=share_link",
  };

  return (
    <>
      <Navbar />
      <div className="container my-4">
        <div className="row">
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
          <div className="col-xl-3">
            <ServiceCard service={service} />
          </div>
        </div>
      </div>
    </>
  );
};

export default ServiceList;
