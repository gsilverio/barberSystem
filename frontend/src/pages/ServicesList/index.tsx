import "./styles.css";
import Navbar from "../../components/Navbar";
import ServiceCard from "../../components/ServiceCard";
const ServiceList = () => {
  return (
    <>
      <Navbar />
      <div className="container my-4">
        <div className="row">
          <div className="col-xl-3">
            <ServiceCard />
          </div>
          <div className="col-xl-3">
            <ServiceCard />
          </div>
          <div className="col-xl-3">
            <ServiceCard />
          </div>
          <div className="col-xl-3">
            <ServiceCard />
          </div>
          <div className="col-xl-3">
            <ServiceCard />
          </div>
          <div className="col-xl-3">
            <ServiceCard />
          </div>
          <div className="col-xl-3">
            <ServiceCard />
          </div>
          <div className="col-xl-3">
            <ServiceCard />
          </div>
        </div>
      </div>
    </>
  );
};

export default ServiceList;
