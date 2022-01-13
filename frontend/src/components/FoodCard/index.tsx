import FoodScore from "components/FoodScore";
import { Link } from "react-router-dom";

function FoodCard() {

  const food = {
    id: 1,
    image: "https://img.itdg.com.br/tdg/images/blog/uploads/2019/05/pizza.jpg",
    title: "Pizza de calabresa",
    count: 2,
    score: 4.5
  };

  return (

    <div>
      <img className="foodlovers-food-card-image" src={food.image} alt={food.title} />
      <div className="foodlovers-card-bottom-container">
        <h3>{food.title}</h3>
        <FoodScore />
        <Link to={`/form/${food.id}`}>
          <div className="btn btn-success foodlovers-btn">Avaliar</div>
        </Link>
      </div>
    </div>
  );
}

export default FoodCard;