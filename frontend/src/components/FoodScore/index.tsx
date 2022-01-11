import FoodStars from "components/FoodStars";
import './styles.css'

function FoodScore() {

  const score = 3.5;
  const count = 13;

  return (
    <div className="foodlovers-score-container">
      <p className="foodlovers-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
      <FoodStars />
      <p className="foodlovers-score-count">{count} avaliações</p>
    </div>

  );
}

export default FoodScore;