import FoodCard from "components/FoodCard";
import Pagination from "components/Pagination";

function Listing() {

  return (
    <>

      <Pagination />

      <div className="container">

        <div className="row">
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <FoodCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <FoodCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <FoodCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <FoodCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <FoodCard />
          </div>

        </div>
      </div>


    </>
  );
}

export default Listing;