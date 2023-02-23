import { BrowserRouter, Routes, Route } from "react-router-dom";
import ServiceList from "./pages/ServicesList";
import Home from "./pages/Home";
import UserList from "./pages/UserList";
const Rotas = () => (
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/kindofservice" element={<ServiceList />} />
      <Route path="/userlist" element={<UserList />} />
    </Routes>
  </BrowserRouter>
);

export default Rotas;
